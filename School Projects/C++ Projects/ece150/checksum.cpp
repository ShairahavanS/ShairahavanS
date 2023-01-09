#include <iostream>
#include <climits>

// @file checksum.cpp
// @author Shairahavan Selvachandran
// @date 2022-09-28

#ifndef MARMOSET_TESTING
int main();
#endif

unsigned int add_checksum( unsigned int n );
void add_checksum( unsigned int array[], std::size_t capacity );
bool verify_checksum( unsigned int n );
unsigned int remove_checksum( unsigned int n );
void remove_checksum( unsigned int array[], std::size_t capacity );

#ifndef MARMOSET_TESTING
int main() {
	unsigned int value_to_protect{21352411};
	unsigned int protected_value = add_checksum(value_to_protect);
	std::cout << "The value " << value_to_protect
		<< " with the checksum added is " << protected_value
		<< "." << std::endl;
	
	if (verify_checksum(protected_value))
	{
		std::cout << "The checksum is valid." << std::endl;
	}
	else   {
		std::cout << "The checksum is invalid." << std::endl;
	} 
	const std::size_t QTY_VALUES {3};
	unsigned int value_series[QTY_VALUES] {20201122, 20209913, 20224012};
	
	add_checksum(value_series, QTY_VALUES);
	
	std::cout << "Series with checksums added: ";
	for (std::size_t series_index {0};
		series_index < QTY_VALUES; series_index++)
	{
		std::cout << value_series[series_index] << " ";
	}

    std::cout << std::endl;
    return 0;
}

#endif


// @param n is the WATNum code that must have its checksum computed
// @returns the checksum of the given code (with the added digit)
unsigned int add_checksum( unsigned int n ) {
	unsigned int sum{};
	unsigned int base{10};
	unsigned int d{};

	// If n is greater more than 8 digits, assign it the greatest possible unsigned int
	if (n > 99999999) {
		return UINT_MAX;
	} else {
		// Create array of 9 unsigned integers (WATNum + checksum)
		unsigned int WATNum[9]{};

		// Loop 8 times to store all WATNum digits in the array
		for (int i{0}; i < 8; ++i) {
				WATNum[i] = ((n%base)/(base/10));
				base *= 10;
		}

		// First Calculation:
		// Starting with the right most digit (0 index),
		// Multiply that digit by 2
		for (int j{0}; j < 8; j += 2) {
			WATNum[j] *= 2;

			// if the digit is greater than 9, the digit becomes the sum of its digits
			// Note: Subtracting the number by 2 also works, but this process is more explicit
			if (WATNum[j] > 9) {
				WATNum[j] = (WATNum[j]/10) + (WATNum[j]%10);
			}
		}

		// Add the sum of all the digits of the current state of the WATNum
		// after the first calculation
		for (int k{0}; k < 8; ++k) {
			sum += WATNum[k];
		}

		// Multiply the sum of the digits by 9
		sum *= 9;

		// The checksum digit is the ones digit of the sum of the WATNum digits
		d = (sum%10);

		// Add the digit to the end of the WATNum
		n = (n*10) + d;

		return n;
	}
}

// @param array[] is a collection of WATNums
// @param capacity the size of the array
void add_checksum( unsigned int array[], std::size_t capacity ) {
	unsigned int n{};

	// Loops through all indexes of array
	// Each WATNum is redirected to the unsigned int add_checksum function
	for (int i{0}; i < capacity; ++i) {
		n = array[i];
		array[i] = add_checksum(n);
	}
}

// @param n is the WATNum code that must be verified (checksum matched)
// @returns if the WATNUm is valid (checksum is correct)
bool verify_checksum( unsigned int n ) {

	unsigned int sansD{};
	unsigned int checksum_d{};
	unsigned int verifysum_d;

	// Takes the given checksum from the WATNum
	sansD = (n/10);
	// Takes the given WATNum without the checksum
	checksum_d = (n%10);

	// Run the WATNum through the unsigned in add_checksum function
	// Takes the checksum of the new WATNum
	verifysum_d = (add_checksum(sansD)%10);


	// If the checksum is correct,  verify it
	if (verifysum_d == checksum_d) {
		return true;
	} 
	// If the checksum is incorrect, the WATNum is invalid
	else {
		return false;
	}
}

// @param n is the WATNum code that must have its checksum removed
// @returns the WATNum without the checksum
unsigned int remove_checksum( unsigned int n ) {

	// If the WATNum is invalid (greater than 9 digits)
	// or if it is deemed invalid,
	// return the greeatest unsisgned int to signal an error
	if (n > 999999999 || (verify_checksum(n) == false)) {
		return UINT_MAX;
	} 
	// Remove the checksum of the number 
	else {
		n /= 10;
		return n;
	}
}

// @param array[] is a collection of WATNums
// @param capacity is the size of the array
void remove_checksum( unsigned int array[], std::size_t capacity ) {
	unsigned int n{};

	// Loops through all the indexes of the array
	// Redirects each loop to the unsigned int remove_checksum function
	// And removes the checksum from each WATNum
	for (int i{0}; i < capacity; ++i) {
		n = array[i];
		array[i] = remove_checksum(n);
	}
}