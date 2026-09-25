
        class Solution {
            public void sort012(int[] arr) {
                int count0 = 0, count1 = 0, count2 = 0;
                int i = 0;

                // Count 0s, 1s, and 2s
                while (i < arr.length) {
                    if (arr[i] == 0) count0++;
                    else if (arr[i] == 1) count1++;
                    else count2++;
                    i++;
                }

                // Rewrite array
                i = 0;
                while (count0-- > 0) arr[i++] = 0;
                while (count1-- > 0) arr[i++] = 1;
                while (count2-- > 0) arr[i++] = 2;
            }
        }

    }
}