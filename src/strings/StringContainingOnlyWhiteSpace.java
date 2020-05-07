package strings;

public class StringContainingOnlyWhiteSpace {

    public static void main(String[] args) {
        String str1 = "      ";
        String str2 = "  1  ";


        System.out.println("str1 is having only white space  :" + str1.trim().isEmpty());
        System.out.println("str2 is having only white space  :" + str2.trim().isEmpty());
    }
}
