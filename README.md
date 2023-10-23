# dsl-exercises
Exercises from the DSL Onboarding Guide

It is recommended that you read the DSL Onboarding Guide before starting the exercises.

## Project structure:
Credit policy files are stored in the src/main/resources/creditpolicy directory:
- policy DSL is in /policies directory
- decision causes are in /dictionary directory
- CP schema is in /schemas directory

## Exercises
### 1. Checking Age
Write a rule that checks the age of the borrower. The age must be greater than or equal to 18 and less than or equal to 80, otherwise the rule must fire an "AGE" decision cause with status

### 2. Check credit history in MoneyMan
Write a rule to check the borrower's credit history in MoneyMan ("mmCalculatedFields" action). If the borrower has at least 1 loan with status "SOLD", then the rule must cancel with cause "SOLD_MM". If the borrower has at least 1 loan with status "EXPIRED", then the rule must cancel with cause "EXP_MM". If the borrower doesn't have any loans with status "COMPLETED", the rule must cancel with cause "NO_COMPLETED_MM". All rules must be checked even if one of the them is triggered.

### 3. Implement an experiment
Write the code to execute experiment "DEMO_EXP" and get its variation. if the experiment rolled to "BRANCH_A" then CP must approve with cause "DEMO_EXP_A". If the experiment rolled to "BRANCH_B", then the CP must cancel with cause "DEMO_EXP_B". If the experiment rolled to "BRANCH_C", then the CP must check the rule from exercise 2. Avoid duplicate rules

### 4. New specification
Create a new spec called "STANDARD_CHECKS". It must consist of rules from Exercises 1 and 2. Rules in this spec must be interrupted when any rule is fired. The main spec executes "STANDARD_CHECKS". After executing "STANDARD_CHECKS", the experiment "DEMO_EXP" must be rolled. If the experiment rolled to "BRANCH_A" and the rule from exercise 1 was not fired, the CP should approve with "DEMO_EXP_A_OPEN_GATE" cause, otherwise it should cancel with "STANDARD_CHECK_CANCEL".