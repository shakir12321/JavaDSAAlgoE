package Arrays;

    import java.util.*;

    class Program {
        public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
            // Write your code here.
            System.out.println("Inside List");

            final List<String> friends =
                    Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sara", "Scott");
            System.out.println(friends);




            printNumberList(List.of(1,2,3,4,5,8,9,11));
            System.out.println();
            Arrays.sort(array);
//            Arrays.stream(array).toArray().



            return new ArrayList<Integer[]>();
        }

        private static void printNumberList(List<Integer> nums) {
//            for (int i = 0; i < nums.size(); i++) {
//                System.out.println(nums.get(i));
//
//            }
//            for (int num:nums) {
//                System.out.println(num);
//
//            }

        }

        public static void f(int i){
            if(i > 99) return;
            else{
                System.out.println(i);
                f(i+1);
//                Date.today();
            }
        }

        public static void main(String[] args) {
            System.out.println("Program");
            int[] array = {12, 3, 1, 2, -6, 5, -8, 6};
            int sum  = 0;
            f(0);
            System.out.println(threeNumberSum(array,sum));
        }
    }
