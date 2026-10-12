; 
            int result = guess(mid);
            
            if (result == 0) {
                return mid; // Found the picked number!
            } else if (result == 1) {
                // Your guess is lower than the picked number, search higher half
                low = mid + 1;
            } else {
                // Your guess is higher than the picked number (result == -1), search lower half
                high = mid - 1;
            }
        }
        
        return -1;
    }
}