package entity;

public class logistics_info {
    private String receiver_zip_code;
    private String receiver_address;
    private String receiver_number;
    private String receiver_name;

    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    public String getReceiver_number() {
        return receiver_number;
    }

    public void setReceiver_number(String receiver_number) {
        this.receiver_number = receiver_number;
    }

    public String getReceiver_address() {
        return receiver_address;
    }

    public void setReceiver_address(String receiver_address) {
        this.receiver_address = receiver_address;
    }

    public String getReceiver_zip_code() {
        return receiver_zip_code;
    }

    public void setReceiver_zip_code(String receiver_zip_code) {
        this.receiver_zip_code = receiver_zip_code;
    }
}
