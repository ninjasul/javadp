package chap11.templatemethod._03.ex02;

import java.util.List;

public class ComplexReportGenerator extends AbstractReportGenerator {

    @Override
    protected String createReport(List<Customer> customers) {
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        for( Customer customer : customers ) {
            if( customer.getPoint() > 100 ) {
                sb.append(String.format("%d: %s\n", customer.getPoint(), customer.getName()));
                sum += customer.getPoint();
            }
        }
        sb.append("점수 합계: " + sum);

        return sb.toString();
    }
}