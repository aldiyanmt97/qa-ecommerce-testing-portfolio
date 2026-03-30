# Test Cases - E-Commerce

| Test ID | Scenario | Steps | Expected Result | Priority | Type |
|--------|----------|-------|----------------|----------|------|
| TC001 | Login with valid credentials | 1. Open login page 2. Enter valid username and password 3. Click the login button | User is successfully logged in and redirected to dashboard | High | Positive |
| TC002 | Login with invalid password | 1. Enter valid username 2. Enter incorrect password 3. Click the login button | Error message is displayed indicating invalid credentials | High | Negative |
| TC003 | Login with empty fields | 1. Leave username and password empty 2. Click login | Validation message is displayed | High | Negative |
| TC004 | Login with special characters | 1. Enter special characters in username/password 2. Click login | System rejects input and shows error message | Medium | Negative |
| TC005 | Add item to cart | 1. Login 2. Click "Add to Cart" on a product | Item is added to cart successfully | High | Positive |
| TC006 | Add multiple items to cart | 1. Login 2. Add multiple products | All selected items appear in cart | High | Positive |
| TC007 | Remove item from cart | 1. Add item to cart 2. Click remove button | Item is removed from cart | Medium | Positive |
| TC008 | Cart persistence after refresh | 1. Add item to cart 2. Refresh page | Item remains in cart after refresh | Medium | Positive |
| TC009 | Checkout with valid data | 1. Add item to cart 2. Proceed to checkout 3. Enter valid details 4. Complete purchase | Order is successfully placed | High | Positive |
| TC010 | Checkout with empty form | 1. Add item 2. Go to checkout 3. Leave form empty 4. Submit | Validation error messages are displayed | High | Negative |
| TC011 | Checkout without items | 1. Go to checkout without adding items | System prevents checkout and shows warning | Medium | Negative |
| TC012 | Product sorting functionality | 1. Login 2. Select sorting option (e.g., price low to high) | Products are sorted correctly | Low | Positive |
| TC013 | Session timeout behavior | 1. Login 2. Stay idle for extended period 3. Perform action | User is logged out or prompted to re-login | Low | Negative |
| TC014 | Invalid input in checkout form | 1. Enter invalid email/phone format 2. Submit form | System shows validation error | Medium | Negative |
| TC015 | Logout functionality | 1. Login 2. Click logout | User is logged out and redirected to login page | High | Positive |

---

## Test Design Techniques Used

- Equivalence Partitioning
- Boundary Value Analysis
- Positive & Negative Testing
- Basic User Flow Coverage
