#include <iostream>

int main();

int main() {

  int x;
  int y;
  int z;
  int GCD = 0;
  int low;

  std::cout << "Greatest Common Divisor Finder Program " << std::endl;

  std::cout << "Enter the first number: ";
  std::cin >> x;
  std::cout << "Enter the second number: ";
  std::cin >> y;
  std::cout << "Enter the third number: ";
  std::cin >> z;

  if ((x <= y) && (x <= z)) {
    low = x;
  } else if ((y <= x) && (y <= z)) {
    low = y;
  } else {
    low = z;
  }

  for (int i = 1; i <= low; ++i) {
    if (((x % i) == 0) && ((y % i) == 0) && ((z % i) == 0)) {
      GCD = i;
    }
  }

  std::cout << "The GCD of the three numbers is " << GCD << "." << std::endl;

  return 0;
}
