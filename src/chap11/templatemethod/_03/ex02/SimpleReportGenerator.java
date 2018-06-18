package chap11.templatemethod._03.ex02;

import java.util.List;

public class SimpleReportGenerator extends AbstractReportGenerator {

    @Override
    protected String createReport(List<Customer> customers) {
        StringBuilder sb = new StringBuilder();

        for( Customer customer : customers ) {
            sb.append(String.format("%s: %d\n", customer.getName(), customer.getPoint()));
        }

        return sb.toString();
    }
}