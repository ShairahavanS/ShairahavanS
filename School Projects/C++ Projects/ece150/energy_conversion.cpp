#include <iostream>

int main();

int main() {
    
    double joules;

    std::cout << "Enter the energy in Joules: ";
    std::cin >> joules;

    double kWh;
    double kCal;
    double BTU;
    double TNT;

    BTU = joules/1055;
    kCal = BTU/3.966;
    kWh = kCal/860.4;
    TNT = kWh/1.162;

    std::cout << "There are " << joules << " Joules of energy." << std::endl;
    std::cout << "There are " << kWh << " kWh of energy." << std::endl;
    std::cout << "There are " << kCal << " kCal of energy." << std::endl;
    std::cout << "There are " << BTU << " BTU of energy." << std::endl;
    std::cout << "There are " << TNT << " kg-TNT of energy." << std::endl;

    return 0;
}