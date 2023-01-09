#include "geesespotter_lib.h"
#include <iostream>

char * createBoard(std::size_t xdim, std::size_t ydim);
void computeNeighbors(char * board, std::size_t xdim, std::size_t ydim);
void hideBoard(char * board, std::size_t xdim, std::size_t ydim);
void cleanBoard(char * board);
void printBoard(char * board, std::size_t xdim, std::size_t ydim);
int reveal(char * board, std::size_t xdim, std::size_t ydim, std::size_t xloc, std::size_t yloc);
int mark(char * board, std::size_t xdim, std::size_t ydim, std::size_t xloc, std::size_t yloc);
bool isGameWon(char * board, std::size_t xdim, std::size_t ydim);

// Early Submission
char * createBoard(std::size_t xdim, std::size_t ydim) {
    
    //create a constant with the grid size
    std::size_t const GRID = (xdim*ydim);
    
    //create pointer to char array that will serve as the game board
    char *p_gameBoard = new char[GRID]{};

    // initialize array with 0 at each index
    for (std::size_t i{0}; i < GRID; ++i) {
        p_gameBoard[i] = 0;
    }

    return p_gameBoard;
}

void hideBoard(char * board, std::size_t xdim, std::size_t ydim){
    std::size_t GRID = xdim*ydim;
    
    // add hidden bit values to all indexes
    for (std::size_t i = 0; i < GRID; ++i) {
        board[i] |= hiddenBit();
    }
}

void cleanBoard(char * board) {
    // deallocate array and wipe out pointer
    delete[] board;
    board = nullptr;
}

void printBoard(char * board, std::size_t xdim, std::size_t ydim) {

    //plit into separate for-loops in order to format 1-d array as grid
    for (std::size_t i = 0; i < ydim; ++i) {
        for (std::size_t k = 0; k < xdim; ++k) {
            // goes through all index eventually but allows for proper formatting
            std::size_t grid = (i*xdim)+k;
            
            // if the value has the bits that indicate it's marked, it will print M
            if ((board[grid]&markedBit()) == markedBit()) {
                std::cout << 'M';
            } 
            // if the value has the bits that indicate it's hidden, it will print *
            else if ((board[grid]&hiddenBit()) == hiddenBit()) {
                std::cout << '*';
            } 
            // if unmarked and revealed, print the integer value of the char (cast and print)
            else {
                int x = board[grid];
                std::cout << x;
            }
            
        }
        // after each row has been printed, a new line will form for the next row
        std::cout << '\n';
    }
}

int mark(char * board, std::size_t xdim, std::size_t ydim, std::size_t xloc, std::size_t yloc) {
    
    std::size_t const POSITION = (yloc*(xdim))+xloc;
    
    // if the bit is hidden, it will toggle the marked bit
    // if the bit is marked, it will become unmarked
    // if the bit is unmarked, it will become marked
    if ((board[POSITION]&hiddenBit()) == hiddenBit()) {
        board[POSITION] ^= markedBit();
        return 0;
    } 
    // if it is revealed, return 2
    else { 
        return 2;
    }
}

// Second Submission
void computeNeighbors(char * board, std::size_t xdim, std::size_t ydim) {
    
    std::size_t const GRID = xdim*ydim;

    // use integer as there will exist negative cases that will be filtered out through if statements
    for (int i{0}; i < GRID; ++i) {
        // for every index that is not a goose
        if ((board[i]&valueMask()) != 9) {
            // if the index is not on the left edge and greater than 0
            if (((i%xdim) != 0) && ((i-1) >= 0)) {
                //if there is a goose in the specific adjacent index, 1 will be added to the current index
                // repeated condition for all following cases
                if (board[i-1] == 9) {
                    ++board[i];
                }
            }
            // if the index is not on the right edge and less than the max grid value
            if ((((i+1)%xdim) != 0) && ((i+1) < GRID)) {
                if (board[i+1] == 9) {
                    ++board[i];
                }
            }
            // for the row above, if still within range of board
            if ((i-xdim) >= 0) {
                if (board[i-xdim] == 9) {
                    ++board[i];
                }
                // if the index is not on the left edge and greater than 0
                if ((((i-xdim)%xdim) != 0) && ((i-xdim-1) >= 0)) {
                    if (board[i-xdim-1] == 9) {
                        ++board[i];
                    }
                }
                // if the index is not on the right edge
                if (((i-xdim+1)%xdim) != 0) {
                    if (board[i-xdim+1] == 9) {
                        ++board[i];
                    }
                }
            }
            // for the row above, given that it is still within the range of the board
            if ((i+xdim) < GRID) {
                if (board[i+xdim] == 9) {
                    ++board[i];
                }
                // if the index is not on the left edge
                if (((i+xdim)%xdim) != 0) {
                    if (board[i+xdim-1] == 9) {
                        ++board[i];
                    }
                }
                // if the index is not on the right edge and within the grid value
                if ((((i+xdim+1)%xdim) != 0) && ((i+xdim+1) < GRID)) {
                    if (board[i+xdim+1] == 9) {
                        ++board[i];
                    }
                }
            }
        }
    }
}

int reveal(char * board, std::size_t xdim, std::size_t ydim, std::size_t xloc, std::size_t yloc) {
    
    std::size_t grid = (yloc*(xdim))+xloc;
    std::size_t const MAX_GRID = xdim*ydim;

    // if the bit is marked, does not reveal
    if ((board[grid]&markedBit()) == markedBit()) {
        return 1;
    } 
    // if the bit is already revealed, does not reveal again
    else if ((board[grid]&hiddenBit()) != hiddenBit()) {
        return 2;
    } 
    // in all other cases, the bit is hidden and can be revealed
    else {
        board[grid] &= valueMask();

        // if the bit is 9, the game is lost
        if ((board[grid]&valueMask()) == 9) {
            return 9;
        } 
        // if the value is 0, must reveal adjacent indexes
        else if ((board[grid]&valueMask()) == 0) {
            // if the grid to the left is valid (index not on edge)
            if ((grid%xdim) != 0) {
                board[grid-1] &= valueMask();
            }
            // if the grid to the right is valid (index not on edge)
            if (((grid+1)%xdim) != 0) {
                board[grid+1] &= valueMask();
            }
            // evaluate similar conditions for row above given that it is within the range of the grid
            if ((grid-xdim) >= 0) {
                board[grid-xdim] &= valueMask();
                if (((grid-xdim)%xdim) != 0) {
                    board[grid-xdim-1] &= valueMask();
                }
                if (((grid-xdim+1)%xdim) != 0) {
                    board[grid-xdim+1] &= valueMask();
                }
            }

            // evaluate similar conditions for row below given that it is within the range of the grid
            if ((grid+xdim) < MAX_GRID) {
                board[grid+xdim] &= valueMask();
                if (((grid+xdim)%xdim) != 0) {
                    board[grid+xdim-1] &= valueMask();
                }
                if (((grid+xdim+1)%xdim) != 0) {
                    board[grid+xdim+1] &= valueMask();
                }
            }
        }
    }

    /// return for hidden values that aren't geese
    return 0;
}

bool isGameWon(char * board, std::size_t xdim, std::size_t ydim) {
    std::size_t const GRID = xdim*ydim;

    for (std::size_t i{0}; i < GRID; ++i) {
        // if there exists a hidden bit that is not a goose, the game is not over
        if (((board[i]&hiddenBit()) == hiddenBit()) && ((board[i]&valueMask()) != 9)) {
            return false;
        } 
    }
    
    // if there are no unrevealed non-goose elements, the game is over
    return true;
}

