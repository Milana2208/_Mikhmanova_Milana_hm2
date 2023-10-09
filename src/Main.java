public class Main {
    public static void main(String[] args) {

    Printeble iPhone = createObject("2");
    Printeble xiomi = createObject("3");
    Printeble sumsung = createObject("4");
    Printeble[] phones = {iPhone,xiomi,sumsung};
        for (Printeble phone: phones
             ) {
            phone.print();
        }

    }

    public static Printeble createObject(String phoneName){
        switch (phoneName){
            case "2":
                Iphone iphone = new Iphone("14 pro", 128);
                return iphone;
            case "3":
                Xiomi xiomi = new Xiomi("Redmi Note 9", 128);
                return xiomi;
            case "4":
                Sumsung sumsung = new Sumsung("SamsungGalaxy s23", 256);
                return sumsung;
            default:
                System.out.println("не известный тип обьекта ");
                return null;
        }
    }
}