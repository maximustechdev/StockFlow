package Company;

public class ConsoleCompanyInitializer implements CompanyInitializer {
    private String company_name;
    private String industry;

    public ConsoleCompanyInitializer(String company_name, String industry) {
        this.company_name = company_name;
        this.industry = industry;
    }

    @Override
    public String getCompanyName() {
        return "Company name: " + company_name;
    }

    @Override
    public String getIndustry() {
        return "Industry: " + industry;
    }

}