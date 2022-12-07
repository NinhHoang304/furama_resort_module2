package common.validate;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexFacility {

    public final String REGEX_ID_SERVICE = "^SV(VL|RO)-[0-9]{4}$";
    public final String REGEX_NAME_SERVICE = "^[A-Z]{1}[a-z]+$";
    public final String REGEX_AREA = "^[3-9]{1}[0-9]+(.[0-9]+|[0-9]+|)$";
    public final String REGEX_RENT_COST = "^[0-9]+$";
    public final String REGEX_MAX_PEOPLE = "^([1-9]|10|11|12|13|14|15|16|17|18|19){1}$";
    public final String REGEX_FLOOR = "^[1-9]+$";
    public final String REGEX_RENT_TYPE = "^(Day|Month|Year)$";
    public final String REGEX_ROOM_TYPE = "^(Standard|Deluxe|Suite|President)$";
    public final String REGEX_FREE_SERVICE = "^(Coffee|Buffet|Spa)$";

    public final String REGEX_BIRTHDAY = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";

    private final Scanner sc = new Scanner(System.in);

    // TODO validate facility
    public String validateFacility(String stringRegex) {
        String temp;
        while (true){
            temp = sc.nextLine();
            if (Pattern.matches(stringRegex, temp)){
                System.out.println("Add Successful!");
                break;
            }else{
                System.err.println("Input invalid. Please try again!");
            }
        }

        return temp;
    }
}
