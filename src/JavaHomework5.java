import java.util.*;

public class JavaHomework5 {

    public static HashSet<Laptops> LaptopCollection(){
        Laptops laptop1 = new Laptops();
        laptop1.brand = "brand1";
        laptop1.os = "os1";
        laptop1.ram = 16;
        laptop1.hardDrive = 512;
        laptop1.cpuFrequency = 3.11F;
        laptop1.screenDiagonal = 13.3F;

        Laptops laptop2 = new Laptops();
        laptop2.brand = "brand2";
        laptop2.os = "os2";
        laptop2.ram = 8;
        laptop2.hardDrive = 1024;
        laptop2.cpuFrequency = 2.56F;
        laptop2.screenDiagonal = 15.1F;

        Laptops laptop3 = new Laptops();
        laptop3.brand = "brand3";
        laptop3.os = "os3";
        laptop3.ram = 16;
        laptop3.hardDrive = 1024;
        laptop3.cpuFrequency = 3.23F;
        laptop3.screenDiagonal = 16.2F;

        return new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3));
    }
    public static void main(String[] args) {
        var laptopColl = LaptopCollection();
//        System.out.println(laptopColl);

        Map<String, Object> filters = new HashMap<>();
        filters.put("brand", "brand2");
//        filters.put("os", "os1");
//        filters.put("ram", 16);
//        filters.put("hardDrive", 512);
//        filters.put("cpuFrequency", 3.11F);
//        filters.put("screenDiagonal", 13.3F);

        Set<Laptops> filteredLaptops = filterLaptops(laptopColl, filters);
        System.out.println(filteredLaptops);
    }

    private static Set<Laptops> filterLaptops(Set<Laptops> laptops, Map<String, Object> filters){
        Set<Laptops> filteredLaptops = new HashSet<>();

        for (Laptops laptop : laptops){
            boolean match = true;

            for (String key : filters.keySet()){
                Object value = filters.get(key);

                switch (key) {
                    case "brand" -> {
                        if (!laptop.getBrand().equals(value)) {
                            match = false;
                        }
                    }
                    case "os" -> {
                        if (!laptop.getOs().equals(value)) {
                            match = false;
                        }
                    }
                    case "ram" -> {
                        if (laptop.getRam() != (int) value) {
                            match = false;
                        }
                    }
                    case "hardDrive" -> {
                        if (laptop.getHardDrive() != (int) value) {
                            match = false;
                        }
                    }
                    case "cpuFrequency" -> {
                        if (laptop.getCpuFrequency() != (float) value) {
                            match = false;
                        }
                    }
                    case "screenDiagonal" -> {
                        if (laptop.getScreenDiagonal() != (float) value) {
                            match = false;
                        }
                    }
                }

                if (!match){
                    break;
                }
            }

            if (match){
                filteredLaptops.add(laptop);
            }
        }
        return filteredLaptops;
    }
}