package com.itemsold;

public class PetSold extends ItemSold {
    private boolean isVaccinated;
    private boolean isNeutered;
    private boolean isHouseBroken;

    public PetSold(int invoiceNumber, String discription, double price, boolean isVaccinated, boolean isNeutered, boolean isHouseBroken) {
        super(invoiceNumber, discription, price);
        this.isVaccinated = isVaccinated;
        this.isNeutered = isNeutered;
        this.isHouseBroken = isHouseBroken;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public boolean isNeutered() {
        return isNeutered;
    }

    public void setNeutered(boolean neutered) {
        isNeutered = neutered;
    }

    public boolean isHouseBroken() {
        return isHouseBroken;
    }

    public void setHouseBroken(boolean houseBroken) {
        isHouseBroken = houseBroken;
    }

    @Override
    public String toString() {
        return "PetSold{" + super.toString() +
                "isVaccinated=" + isVaccinated +
                ", isNeutered=" + isNeutered +
                ", isHouseBroken=" + isHouseBroken +
                '}';
    }
}