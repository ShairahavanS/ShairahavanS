#include <iostream>
#include <cmath>

#ifndef MARMOSET_TESTING
int main();
#endif

double mean (int data_elements[], std::size_t capacity);
double standard_deviation (int data_elements[], std::size_t capacity);

#ifndef MARMOSET_TESTING
int main() {

  int data_elements[10]{5,2,3,1,5,7,2,3,2,2};
  const std::size_t capacity {10};
  double meanS = mean(data_elements, capacity);
  double standard_deviationS = standard_deviation(data_elements, capacity);

  std::cout << meanS << "    " << standard_deviationS << std::endl;
  return 0;
}
#endif

double mean (int data_elements[], std::size_t capacity) {
  double meanS{};

  for (int i = 0; i < capacity; ++i) {
    meanS += data_elements[i];
  }

  meanS /= (capacity*1.0);
  return meanS;
}

double standard_deviation (int data_elements[], std::size_t capacity) {
  double meanS{};
  double standard_deviationS{};

  meanS = mean(data_elements, capacity);

  for (int i = 0; i < capacity; ++i) {
    standard_deviationS += pow((data_elements[i] - meanS), 2);
  }

  standard_deviationS /= (capacity-1.0);
  standard_deviationS = sqrt(standard_deviationS);
  return standard_deviationS;
}

