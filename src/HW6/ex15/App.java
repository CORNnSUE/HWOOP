package ex15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager country = new CountryArrayManager();

    public static void main(String[] args) {
        init();
        System.out.println("Original data");
        testOriginalData();
        System.out.println("Africa: ");
        testFilterAfricaCountry();
        System.out.println("Asia: ");
        testFilterAsiaCountry();
        System.out.println("Europe: ");
        testFilterEuropeCountry();
        System.out.println("South America: ");
        testFilterSouthAmericaCountry();
        System.out.println("North America: ");
        testFilterNorthAmericaCountry();
        System.out.println("Oceania: ");
        testFilterOceaniaCountry();


        System.out.println("Decreasing by Population:");
        testSortDecreasingByPopulation();
        System.out.println("Increasing by Population:");
        testSortIncreasingByPopulation();
        System.out.println("Decreasing by area:");
        testSortDecreasingByArea();
        System.out.println("Increasing by area:");
        testSortIncreasingByArea();
        System.out.println("Decreasing by gdp:");
        testSortDecreasingByGdp();
        System.out.println("Increasing by gdp:");
        testSortIncreasingByGdp();

        System.out.println("The most population country: ");
        testFilterMostPopulousCountries();
        System.out.println("The least population country: ");
        testFilterLeastPopulousCountries();
        System.out.println("The largest area country: ");
        testFilterLargestAreaCountries();
        System.out.println("The smallest area country: ");
        testFilterSmallestAreaCountries();
        System.out.println("The highest gdp country: ");
        testFilterHighestGdpCountries();
        System.out.println("The lowest gdp country: ");
        testFilterLowestGdpCountries();

    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));
            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }
                int population;
                double area;
                double gdp;

                String code = dataList.get(0);
                String name = dataList.get(1);
                population = Integer.parseInt(dataList.get(2));
                area = Double.parseDouble(dataList.get(3));
                gdp = Double.parseDouble(dataList.get(4));
                String region = dataList.get(5);
                if (region.equals("Oceania")) {
                    Country countries = new OceaniaCountry(code, name, population, area, gdp);
                    App.country.append(countries);
                } else if (region.equals("Asia")) {
                    Country countries = new AsiaCountry(code, name, population, area, gdp);
                    App.country.append(countries);
                } else if (region.equals("Europe")) {
                    Country countries = new EuropeCountry(code, name, population, area, gdp);
                    App.country.append(countries);
                } else if (region.equals("North America")) {
                    Country countries = new NorthAmericaCountry(code, name, population, area, gdp);
                    App.country.append(countries);
                } else if (region.equals("South America")){
                    Country countries = new SouthAmericaCountry(code, name, population, area, gdp);
                    App.country.append(countries);
                } else {
                    Country countries = new AfricaCountry(code, name, population, area, gdp);
                    App.country.append(countries);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }

        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "C:\\code jv\\hw7\\src\\data\\countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codeString = CountryArrayManager.codeOfcountriesToString(country.getCountries());
        System.out.print(codeString);
        System.out.println("\n");
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = country.sortByIncreasingPopulation();
        String codeString = CountryArrayManager.codeOfcountriesToString(countries);
        System.out.print(codeString);
        System.out.println("\n");
    }

    public static void testSortDecreasingByPopulation() {
        Country[] countries = country.sortByDecreasingPopulation();
        String codeString = CountryArrayManager.codeOfcountriesToString(countries);
        System.out.print(codeString);
        System.out.println("\n");
    }

    public static void testSortIncreasingByArea() {
        Country[] countries = country.sortByIncreasingArea();
        String codeString = CountryArrayManager.codeOfcountriesToString(countries);
        System.out.print(codeString);
        System.out.println("\n");
    }

    public static void testSortDecreasingByArea() {
        Country[] countries = country.sortByDecreasingArea();
        String codeString = CountryArrayManager.codeOfcountriesToString(countries);
        System.out.print(codeString);
        System.out.println("\n");
    }

    public static void testSortIncreasingByGdp() {
        Country[] countries = country.sortByIncreasingGdp();
        String codeString = CountryArrayManager.codeOfcountriesToString(countries);
        System.out.print(codeString);
        System.out.println("\n");
    }

    public static void testSortDecreasingByGdp() {
        Country[] countries = country.sortByDecreasingGdp();
        String codeString = CountryArrayManager.codeOfcountriesToString(countries);
        System.out.print(codeString);
        System.out.println("\n");
    }

    public static void testFilterAfricaCountry() {
        Country[] countries = country.filterAfricaCountry();
        String codeString = CountryArrayManager.codeOfcountriesToString(countries);
        System.out.print(codeString);
        System.out.println("\n");
    }

    public static void testFilterAsiaCountry() {
        Country[] countries = country.filterAsiaCountry();
        String codeString = CountryArrayManager.codeOfcountriesToString(countries);
        System.out.print(codeString);
        System.out.println("\n");
    }

    public static void testFilterEuropeCountry() {
        Country[] countries = country.filterEuropeCountry();
        String codeString = CountryArrayManager.codeOfcountriesToString(countries);
        System.out.print(codeString);
        System.out.println("\n");
    }

    public static void testFilterNorthAmericaCountry() {
        Country[] countries = country.filterNorthAmericaCountry();
        String codeString = CountryArrayManager.codeOfcountriesToString(countries);
        System.out.print(codeString);
        System.out.println("\n");
    }

    public static void testFilterOceaniaCountry() {
        Country[] countries = country.filterOceaniaCountry();
        String codeString = CountryArrayManager.codeOfcountriesToString(countries);
        System.out.print(codeString);
        System.out.println("\n");
    }

    public static void testFilterSouthAmericaCountry() {
        Country[] countries = country.filterSouthAmericaCountry();
        String codeString = CountryArrayManager.codeOfcountriesToString(countries);
        System.out.print(codeString);
        System.out.println("\n");
    }

    public static void testFilterMostPopulousCountries() {
        Country[] countries = country.filterMostPopulousCountries(10);
        String codeString = CountryArrayManager.codeOfcountriesToString(countries);
        System.out.print(codeString);
        System.out.println("\n");
    }

    public static void testFilterLeastPopulousCountries() {
        Country[] countries = country.filterLeastPopulousCountries(10);
        String codeString = CountryArrayManager.codeOfcountriesToString(countries);
        System.out.print(codeString);
        System.out.println("\n");
    }

    public static void testFilterLargestAreaCountries() {
        Country[] countries = country.filterLargestAreaCountries(10);
        String codeString = CountryArrayManager.codeOfcountriesToString(countries);
        System.out.print(codeString);
        System.out.println("\n");
    }

    public static void testFilterSmallestAreaCountries() {
        Country[] countries = country.filterSmallestAreaCountries(10);
        String codeString = CountryArrayManager.codeOfcountriesToString(countries);
        System.out.print(codeString);
        System.out.println("\n");
    }

    public static void testFilterHighestGdpCountries() {
        Country[] countries = country.filterHighestGdpCountries(10);
        String codeString = CountryArrayManager.codeOfcountriesToString(countries);
        System.out.print(codeString);
        System.out.println("\n");
    }

    public static void testFilterLowestGdpCountries() {
        Country[] countries = country.filterLowestGdpCountries(10);
        String codeString = CountryArrayManager.codeOfcountriesToString(countries);
        System.out.print(codeString);
        System.out.println("\n");
    }
}
