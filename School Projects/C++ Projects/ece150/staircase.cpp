#include <iostream>

int main();

int main() {
  double x;

  std::cout << "Enter value of x: ";
  std::cin >> x;

  // This local variable should hold the result of stair( x )
  int stair{};

  // TASK: write code that calculates an integer value
  // corresponding to the value of the function stair( x ) here

  if (x == 0) {
    stair = 0;
  } else if (x > 0) {
    for (int i{0}; i <= x; ++i) {
      stair = i;
    }
  } else {
    for (int k{0}; k > x; --k) {
      stair = k;
    }

    stair -= 1;
  }

  std::cout << "The value of stair(x) is: ";
  std::cout << stair;
  std::cout << std::endl;

  return 0;
}