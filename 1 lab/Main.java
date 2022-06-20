package ua.lviv.iot.firstLab;

record Drug(String name, int volumeInG, int volumeInMG,
            String material, int maxDoses, int priceInUah) {
    public static final String DRUG_NAME = "Aspirin";

    public Drug() {
        this(DRUG_NAME);
    }

    public Drug(final String name){
        this(name, 0);
    }

    public Drug(final String name, final int volumeInG){
        this(name,volumeInG, 0);
    }

    public Drug(final String name, final int volumeInG, final int volumeInMg){
        this(name, volumeInG, volumeInMg, "Kreida", 2, 1000);
    }

    @Override
    public String toString(){
        return "NAME - " + this.name + "\nVOLUME IN G - "+ this.volumeInG
                + "\nVOLUME IN MG - " +this.volumeInMG+"\nMATERIAL - "
                + this.material+"\nMAX DOSES - "+ this.maxDoses+" PRICE IN UAH - "+this.priceInUah + "\n";
    }

    public static String getDrugName(){
        return DRUG_NAME;
    }
}