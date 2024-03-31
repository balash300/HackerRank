package org.example.Java_.Java_Annotations;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FamilyBudget {
    String userRole() default "GUEST";
    int budgetLimit() default 100;
}
