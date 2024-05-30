package Buoi7.TEST;

public class Shop {
    final int MAX_LIMIT = 1000;
    private Phone[] phones = new Phone[MAX_LIMIT];

    private int count = 0;

    public boolean addPhone(Phone phone){
        if (this.count >= MAX_LIMIT)
            return false;
        this.phones[count++] = phone;
        return true;
    }

    public Phone getPhoneByIndex(int index){
        if (index < this.count) {
            return this.phones[index];
        }
        return null;
    }

    public Phone getPhoneByModel(String model){
        for (int i = 0; i < this.count; i++) {
            if (this.phones[i].getModel().equals(model)){
                return this.phones[i];
            }
        }
        return null;
    }

    public int getCount() {
        return count;
    }
}
