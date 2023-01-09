#include <cassert>
#include <iomanip>
#include <iostream>

#include "project4.hpp"
#include "History.hpp"
#include "Transaction.hpp"

////////////////////////////////////////////////////////////////////////////////
// Definitions for Transaction class
////////////////////////////////////////////////////////////////////////////////
//
//

// Constructor
// TASK 1
//


Transaction::Transaction( std::string ticker_symbol,  unsigned int day_date,  
        unsigned int month_date,  unsigned year_date, 
        bool buy_sell_trans,  unsigned int number_shares,  
        double trans_amount ):
symbol{ticker_symbol}, day{day_date}, 
month{month_date}, year{year_date}, 
trans_type{}, shares{number_shares}, 
amount{trans_amount}, trans_id{assigned_trans_id}, 
acb{}, acb_per_share{}, 
share_balance{}, cgl{}, p_next{}
{
  ++assigned_trans_id;
  if (buy_sell_trans == true) {
    trans_type = "Buy";
  } else {
    trans_type = "Sell";
  }
}


// Destructor
// TASK 1
//

Transaction::~Transaction() {
  delete p_next;
  symbol = '\0'; 
  day = 0;
  month = 0;
  year = 0;
  trans_type = '\0'; 
  shares = 0;
  amount = 0;
  trans_id = 0;
  acb = 0;
  acb_per_share = 0;
  share_balance = 0;
  cgl = 0;
  p_next = nullptr;
}

// Overloaded < operator.
// TASK 2
//

bool Transaction::operator<( Transaction const &other ) {

  if (get_year() < other.year) {
    return (get_year() < other.year);
  } else if (get_year() == other.year) {
    if (get_month() < other.month) {
      return (get_month() < other.month);
    } else if (get_month() == other.month) {
      if (get_day() < other.day) {
        return (get_day() < other.day);
      } else if (get_day() == other.day) {
        return (get_trans_id() > other.trans_id);
      }
    }
  }
  return false;
}

// GIVEN
// Member functions to get values.
//
std::string Transaction::get_symbol() const { return symbol; }
unsigned int Transaction::get_day() const { return day; }
unsigned int Transaction::get_month() const { return month; }
unsigned int Transaction::get_year() const { return year; }
unsigned int Transaction::get_shares() const { return shares; }
double Transaction::get_amount() const { return amount; }
double Transaction::get_acb() const { return acb; }
double Transaction::get_acb_per_share() const { return acb_per_share; }
unsigned int Transaction::get_share_balance() const { return share_balance; }
double Transaction::get_cgl() const { return cgl; }
bool Transaction::get_trans_type() const { return (trans_type == "Buy") ? true: false ; }
unsigned int Transaction::get_trans_id() const { return trans_id; }
Transaction *Transaction::get_next() { return p_next; }

// GIVEN
// Member functions to set values.
//
void Transaction::set_acb( double acb_value ) { acb = acb_value; }
void Transaction::set_acb_per_share( double acb_share_value ) { acb_per_share = acb_share_value; }
void Transaction::set_share_balance( unsigned int bal ) { share_balance = bal ; }
void Transaction::set_cgl( double value ) { cgl = value; }
void Transaction::set_next( Transaction *p_new_next ) { p_next = p_new_next; }

// GIVEN
// Print the transaction.
//
void Transaction::print() {
  std::cout << std::fixed << std::setprecision(2);
  std::cout << std::setw(4) << get_trans_id() << " "
    << std::setw(4) << get_symbol() << " "
    << std::setw(4) << get_day() << " "
    << std::setw(4) << get_month() << " "
    << std::setw(4) << get_year() << " ";


  if ( get_trans_type() ) {
    std::cout << "  Buy  ";
  } else { std::cout << "  Sell "; }

  std::cout << std::setw(4) << get_shares() << " "
    << std::setw(10) << get_amount() << " "
    << std::setw(10) << get_acb() << " " << std::setw(4) << get_share_balance() << " "
    << std::setw(10) << std::setprecision(3) << get_acb_per_share() << " "
    << std::setw(10) << std::setprecision(3) << get_cgl()
    << std::endl;
}


////////////////////////////////////////////////////////////////////////////////
// Definitions for the History class
////////////////////////////////////////////////////////////////////////////////
//
//


// Constructor
// TASK 3
//


History::History():
  p_head{} {
}


// Destructor
// TASK 3
//

History::~History() {
  
  if (get_p_head() != nullptr) {
    
    Transaction *p_list_head {get_p_head()};

    if (p_list_head != nullptr) {
    while (p_list_head != nullptr) {
      Transaction *p_old_head {p_list_head};
      p_list_head = p_list_head->get_next();
      delete p_old_head;      
    }

    delete p_list_head;
    p_list_head = nullptr;
    }
  }
  

  delete p_head;
  p_head = nullptr;
}


// second submission
// read_history(...): Read the transaction history from file.
// TASK 4
//

void History::read_history() {

  std::string tmp_symbol{};
  unsigned int tmp_day{};
  unsigned int tmp_month{};
  unsigned int tmp_year{};
  bool tmp_trans_type{};
  unsigned int tmp_shares{};
  double tmp_amount{};

  ece150::open_file();

  while (ece150::next_trans_entry() == true) {
    
    tmp_symbol = ece150::get_trans_symbol();
    tmp_day = ece150::get_trans_day();
    tmp_month = ece150::get_trans_month();
    tmp_year = ece150::get_trans_year();
    tmp_shares = ece150::get_trans_shares();
    tmp_trans_type = ece150::get_trans_type();
    tmp_amount = ece150::get_trans_amount();

    Transaction *new_entry = new Transaction{tmp_symbol, tmp_day, tmp_month, tmp_year, tmp_trans_type, tmp_shares, tmp_amount};
    insert(new_entry);
    new_entry = nullptr;

    tmp_symbol = '\0';
    tmp_day = 0;
    tmp_month = 0;
    tmp_year = 0;
    tmp_trans_type = '\0';
    tmp_shares = 0;
    tmp_amount = 0;
  }
  
  ece150::close_file();
}


// second submission
// insert(...): Insert transaction into linked list.
// TASK 5
//

void History::insert( Transaction *p_new_trans  ) {

  if ((get_p_head()) == nullptr) {
    Transaction *p_new_node{p_new_trans};
    p_head = p_new_node; 
    p_new_node = nullptr;
    //std::cout << "ym\n";
  } 
  else {
    //std::cout << "dn\n";
    Transaction *p_node{ get_p_head() }; 
    bool exit = false;
    while (exit == false) {
     if ((p_node)->get_next() == nullptr) {
       p_node->set_next( p_new_trans );
       exit = true;
     } else {
        p_node = p_node->get_next();
     }
    } 
    p_node = nullptr;
  }
  //std::cout << "@humiliated\n";
}


// sort_by_date(): Sort the linked list by trade date.
// TASK 6
//

void History::sort_by_date() {
  //std::cout << "sure\n";
  Transaction *head{};

  Transaction *sure {get_p_head()};
  //bool unsure = false;
  
  //if ()

  //std::cout << "sure\n";

  //sure = sure->get_next();
  //head = sure;
  if (sure != nullptr) {
    //for ( Transaction *p_node {get_p_head()} ; p_node != nullptr; p_node = get_p_head()) {
    for ( Transaction *p_node {get_p_head()} ; p_node != nullptr; p_node = get_p_head()) {
      //std::cout << "auston matthews\n";
      if (p_node != nullptr) {
      Transaction *p_tmp{p_node};
      Transaction *p_node2{p_node->get_next()};
      //p_tmp->print();
      //std::cout << "mitchy marner\n";
      p_head = p_node2;
      p_tmp->set_next(nullptr);

      if (head == nullptr) {
        head = p_tmp;
        //std::cout << "ed sheeran\n";
        //head->print();
      } 
      else {
        //std::cout << "Johnny Toronto\n";
        Transaction *p_first {head};

        bool sure = false;

        if (*p_tmp < *p_first) {
          p_tmp->set_next(p_first);
          head = p_tmp;
        } 
        else {
          for (p_first = head; (p_first != nullptr) && (sure == false); p_first = p_first->get_next()) {
          
            if (p_first->get_next() != nullptr) {
              Transaction *p_second {p_first->get_next()};
              if (*p_tmp < *p_second) {
              p_first->set_next(p_tmp);
              p_tmp->set_next(p_second);
                //std::cout << "Nicky Bob\n";
                sure = true;
              }
              p_second = nullptr;
            }
            else {
              p_first->set_next(p_tmp);
              //std::cout << "Willy Styles\n";
              sure = true;
            }
          }
        }
        p_first = nullptr;
      }

      //print();
      p_node2 = nullptr;
      p_tmp = nullptr;
      }
    
  }
  p_head = head;
  
  }
  head = nullptr;
  sure = nullptr;
}


// update_acb_cgl(): Updates the ACB and CGL values.
// TASK 7
//

void History::update_acb_cgl() {
  double cumulative_acb{};
  double cumulative_shares{};
  double acb_per{};
  double old_acb_per{};

  for ( Transaction *p_node {get_p_head()} ; p_node != nullptr; p_node = p_node->get_next()) {
      
      if (p_node->get_trans_type() == true) {
        cumulative_acb += p_node->get_amount();
        cumulative_shares += p_node->get_shares();
      } else { 
        cumulative_acb -= ((old_acb_per)*(p_node->get_shares()));
        cumulative_shares -= p_node->get_shares();
      }

      p_node->set_acb(cumulative_acb);
      p_node->set_share_balance(cumulative_shares);
      acb_per = cumulative_acb/p_node->get_share_balance();
      p_node->set_acb_per_share((acb_per));

      compute_cgl(p_node->get_year());
      old_acb_per = p_node->get_acb_per_share();
  }
}

// compute_cgl(): )Compute the ACB, and CGL.
// TASK 8

double History::compute_cgl( unsigned int year ) {
  
  double cumulative_cgl{};

  for ( Transaction *p_node {get_p_head()} ; p_node != nullptr; p_node = p_node->get_next()) {
      
      if (p_node->get_next() != nullptr) {
        Transaction *p_next_node {p_node->get_next()};
        if (p_next_node->get_trans_type() == false) {
          double cgl{};
          cgl = (p_next_node->get_amount() - ((p_next_node->get_shares())*(p_node->get_acb_per_share())));
          p_next_node->set_cgl(cgl);

          if (p_next_node->get_year() == year) {
              cumulative_cgl += cgl;
          }
        }
        p_next_node = nullptr;
      }
      
  }
  
  return cumulative_cgl;
}

// second submission
// print() Print the transaction history.
//TASK 9
//

void History::print() {
  std::cout << "========== BEGIN TRANSACTION HISTORY ============" << std::endl;
  
  for ( Transaction *p_node2 {get_p_head()} ; p_node2 != nullptr; p_node2 = p_node2->get_next()) {
      p_node2->print();
  }

  std::cout << "========== END TRANSACTION HISTORY ============" << std::endl;
}

// GIVEN
// get_p_head(): Full access to the linked list.
//
Transaction *History::get_p_head() { return p_head; }
