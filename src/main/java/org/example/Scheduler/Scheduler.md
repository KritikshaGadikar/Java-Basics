# **Scheduler**

## **1. Scheduler in Java**
A **scheduler** is a mechanism used to execute tasks at specific intervals or on a set schedule. In Java and Spring Boot, scheduling is used to automate repetitive tasks such as:
- Sending emails at a fixed time
- Generating reports daily
- Running background tasks in applications

### **Types of Scheduling in Java**
1. **Using `ScheduledExecutorService`** (Recommended for non-Spring applications)
2. **Using `Timer` and `TimerTask`** (Older approach, less flexible)
3. **Using Spring Boot `@Scheduled` Annotation** (Best for Spring applications)
4. **Using Quartz Scheduler** (For enterprise-level scheduling)

---

## **2. Using `@Scheduled` in Spring Boot**
### **Example of `@Scheduled` with Fixed Rate and Fixed Delay**
```java
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class FixedScheduler {

    @Scheduled(fixedRate = 5000) // Runs every 5 seconds
    public void runAtFixedRate() {
        System.out.println("Task running at fixed rate: " + java.time.LocalTime.now());
    }

    @Scheduled(fixedDelay = 5000) // Runs 5 seconds after the last execution completes
    public void runWithFixedDelay() {
        System.out.println("Task running with fixed delay: " + java.time.LocalTime.now());
    }
}
```

### **Difference Between `fixedRate` and `fixedDelay`**
| Feature | `fixedRate` | `fixedDelay` |
|---------|------------|-------------|
| **Execution Type** | Runs at a fixed interval, regardless of execution time | Runs after the previous task completes |
| **Example** | Every 5 seconds, even if the task takes 3 seconds | Waits 5 seconds after the previous task ends |

---

### **Conclusion**
- A **scheduler** is used to automate periodic tasks in Java applications.
- Spring Boot provides `@Scheduled` for fixed rate, fixed delay, and cron-based scheduling.
- Use `fixedRate` when tasks need to run at precise intervals and `fixedDelay` when execution should be delayed after task completion.
