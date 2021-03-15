package assignment_1.question_1;

public class Contact {
    private String name;
    private int countryCode;
    private int cityCode;
    private String mobileNum;
    private String mobileNumType;

    public Contact(String name, int countryCode, int cityCode, String mobileNum, String mobileNumType) {
        this.name = name;
        this.countryCode = countryCode;
        this.cityCode = cityCode;
        this.mobileNum = mobileNum;
        this.mobileNumType = mobileNumType;
    }

    public Contact(Contact contact) {
        this.name = contact.name;
        this.countryCode = contact.countryCode;
        this.cityCode = contact.cityCode;
        this.mobileNum = contact.mobileNum;
        this.mobileNumType = contact.mobileNumType;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public String getName() {
        return name;
    }

    void printContact() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nCountry code: " + countryCode + "\nCity code: " + cityCode + "\nMobile number: "
                + mobileNum + "\nMobile number type: " + mobileNumType;
    }
}
