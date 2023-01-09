#include <iostream>

int main();

double areaTri(double x1, double x2, double y1, double y2);
double sum(double sumTrap, double area);
void reset(double x1, double x2, double y1, double y2);

int main() {
  int number;
  double x1{};
  double y1{};
  double x2{};
  double y2{};
  double sumTrap{};
  double area{};

  while (number != 0) {
    
    std::cout << "Enter the number of trapezoids: ";
    std::cin >> number;

    if (number == 0) {
      std::cout << "Program terminated.\n";
    } else {
    std::cout << "Enter the x y coordinates:\n";

    std::cin >> x1;
    std::cin >> y1;

    for (int i = 0; i < number; ++i) {
        std::cin >> x2;
        std::cin >> y2;
        area = areaTri(x1, x2, y1, y2);
        sumTrap = sum(sumTrap, area);

        x1 = x2;
        y1 = y2;
        x2 = 0;
        y2 = 0;
    }
    std::cout << "The area the trapezoids take up is: " << sumTrap << std::endl;

    x1 = 0;
    x2 = 0;
    y1 = 0;
    y2 = 0;
    sumTrap = 0;
    }
  }
  return 0;
}

double areaTri(double x1, double x2, double y1, double y2) {
  double area{};

  area = ((x2 - x1) * (y1 + y2)) / 2.0;
  return area;
}

double sum(double sumTrap, double area) { 
    return (area + sumTrap); 
}