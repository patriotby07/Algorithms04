public class GoodAndBadNumber {
    /**
     * 7. Given an integer M perform the following conditional actions:
     * If M is multiple of 3 and 5 then return "Good Number".
     * If M is only multiple of 3 and not of 5 then return "Bad Number"
     * If M is only multiple of 5 and not of 3 then return "Poor Number"
     * If M doesn't satisfy any of the above conditions then return "-1"
     **/

    public String goodAndBadNumber(int m) {

        if (m % 3 == 0 && m % 5 == 0) {

            return "Good Number";
        } else if (m % 3 == 0) {

            return "Bad Number";
        } else if (m % 5 == 0) {

            return "Poor Number";
        } else

            return "-1";
    }
}

//if (m % 3 == 0 && m % 5 == 0) {   //УТОЧНИТЬ!!!!!!!
//            return "Good Number";
//        }else if (m % 3 == 0 || m % 5 == 0) {
//            return "Bad Number";
//        }else
//            return "-1";
//    }