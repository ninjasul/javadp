package chap11.templatemethod._03.ex02;

import java.util.List;

public abstract class AbstractReportGenerator {
    public String generate(List<Customer> customers) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("고객 수: %d\n", customers.size()));
        sb.append(createReport(customers));
        return sb.toString();
    }

    protected abstract String createReport(List<Customer> customers);
}