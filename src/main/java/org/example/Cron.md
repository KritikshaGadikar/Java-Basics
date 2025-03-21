# **Cron**

## **1. What is Cron?**
A **Cron expression** is a string that defines a schedule for executing a task. It is commonly used in scheduling frameworks, including Spring Boot and Unix-based systems.

### **Cron Expression Format (Spring Boot)**
```plaintext
┌───────────── Second (0 - 59)
│ ┌───────────── Minute (0 - 59)
│ │ ┌───────────── Hour (0 - 23)
│ │ │ ┌───────────── Day of Month (1 - 31)
│ │ │ │ ┌───────────── Month (1 - 12)
│ │ │ │ │ ┌───────────── Day of Week (0 - 7) (Sunday=0 or 7)
│ │ │ │ │ │
* * * * * *
```

### **Examples of Cron Expressions**
| Cron Expression  | Meaning |
|-----------------|---------|
| `"0 * * * * *"` | Runs every minute |
| `"0 0 12 * * ?"` | Runs every day at **12:00 PM** |
| `"0 0/5 14 * * ?"` | Runs every **5 minutes between 2 PM and 2:59 PM** |
| `"0 0 9 ? * MON-FRI"` | Runs at **9 AM, Monday to Friday** |
| `"0 0 0 1 * ?"` | Runs **on the 1st day of every month** |

### **Special Characters in Cron**
| Character | Meaning |
|-----------|---------|
| `*` | Any value (wildcard) |
| `?` | No specific value |
| `,` | Used to specify multiple values (e.g., `MON,WED,FRI`) |
| `-` | Specifies a range (e.g., `10-12` means 10 AM to 12 PM) |
| `/` | Specifies increments (e.g., `0/5` means every 5 minutes) |

---

## **2. Using `@Scheduled` with Cron in Spring Boot**
### **Example of `@Scheduled` with Cron**
```java
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronScheduler {

    @Scheduled(cron = "0 0 9 * * MON-FRI") // Runs at 9 AM from Monday to Friday
    public void runTask() {
        System.out.println("Cron Job executed at: " + java.time.LocalTime.now());
    }
}
```

---

## **3. When to Use Cron?**
- **Use `@Scheduled(fixedRate = ...)` or `fixedDelay = ...`** → When tasks need to run at simple intervals.
- **Use `@Scheduled(cron = "...")`** → When you need more precise scheduling, like running a job every Monday at 8 AM.

---

### **Conclusion**
- **Cron expressions** allow precise scheduling with flexible date and time rules.
- Spring Boot provides `@Scheduled` for cron-based execution.
- Use cron when tasks require execution at specific days and times.
