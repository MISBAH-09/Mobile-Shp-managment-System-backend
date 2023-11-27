package MobileShopManagementSystem;

public class Date {
    private int date;
    private int month;
    private int year;
    Date(){

    }

    Date(int date, int month, int year) {
        if(month<=12 && date<=31){
            setDate(date);
            setMonth(month);
            setYear(year);
        }
        else {
            System.out.println("Invalid date...");
        }
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDate() {
        return this.date;
    }

    public void setMonth(int month) {
            this.month = month;
    }

    public int getMonth() {
        return this.month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        String D = String.format("%4d/%d/%d ", this.date, this.month, this.year);
        return D;
    }
    public boolean iisRecent(Date d1, Date d2) {
            if (d1.getYear() == d2.getYear()&& d2.getMonth() == d1.getMonth()&&d1.getDate()==d2.getDate()) {
                return  true;
            }
            return false;
    }

//    public Date iisRecent(Date d1, Date d2) {
//        System.out.println("The latest product  is");
//        if (d1.getYear() > d2.getYear()) {
//            return d1;
//        } else if (d2.getYear() > d1.getYear()) {
//            return d2;
//        } else {
//            if (d1.getYear() == d2.getYear()) {
//                if (d1.getMonth() > d2.getMonth()) {
//                    return d1;
//                }
//
//                if (d2.getMonth() > d1.getMonth()) {
//                    return d2;
//                }
//
//                if (d2.getMonth() == d1.getMonth()) {
//                    if (d2.getDate() > d1.getDate()) {
//                        return d2;
//                    }
//
//                    if (d1.getDate() > d2.getDate()) {
//                        return d1;
//                    }
//                }
//            }
//
//            return d2;
//        }
//    }
}

