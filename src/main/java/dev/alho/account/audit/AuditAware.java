package dev.alho.account.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAware")
public class AuditAware implements AuditorAware<String> {

    /**
     * Returns the current auditor for auditing purposes.
     * In this case, it returns a fixed string "ACCOUNTS_MS" as the auditor.
     *
     * @return an Optional containing the auditor's identifier
     */
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("ACCOUNTS_MS");
    }
}
