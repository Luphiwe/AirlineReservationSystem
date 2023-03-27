/*
* Name: Sbani Sithole
* Student Number: 219446563
* Check class
* */
package za.ac.cput.domain;
public class Check {
    private int checkNumber;
    private String bankId;

    public Check(Builder builder) {
        this.checkNumber = builder.checkNumber;
        this.bankId = builder.bankId;
    }

    public int getCheckNumber() {
        return checkNumber;
    }

    public void setCheckNumber(int checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    //Builder Class
    public static class Builder {
        private int checkNumber;
        private String bankId;

        public Builder(int checkNumber, String bankId) {
            this.checkNumber = checkNumber;
            this.bankId = bankId;
        }

        public Check build() {
            return new Check(this);
        }
    }

}
