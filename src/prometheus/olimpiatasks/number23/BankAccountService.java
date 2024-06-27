package prometheus.olimpiatasks.number23;

import java.util.List;
import java.util.Map;

public interface BankAccountService {
    String findClientWithBiggestBalance(Map<String, List<BankAccount>> bankAccountsMap);
}