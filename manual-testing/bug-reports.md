# Bug Reports - E-Commerce Testing

---

## BUG001 - Login fails with valid credentials

**Environment:**
- Browser: Chrome (latest)
- OS: Windows 10
- URL: https://www.saucedemo.com/

**Steps to Reproduce:**
1. Open the login page
2. Enter valid username: standard_user
3. Enter valid password: secret_sauce
4. Click the login button

**Expected Result:**
User should be successfully logged in and redirected to the dashboard page.

**Actual Result:**
Login fails and user remains on login page without any error message.

**Severity:** Critical  
**Priority:** High  

---

## BUG002 - Cart does not update after removing item

**Environment:**
- Browser: Chrome
- OS: Windows 10

**Steps to Reproduce:**
1. Login to the application
2. Add a product to the cart
3. Navigate to cart page
4. Click "Remove" button

**Expected Result:**
Item should be removed from cart and cart count updated.

**Actual Result:**
Item remains in cart and cart count does not change.

**Severity:** Major  
**Priority:** High  

---

## BUG003 - Checkout allows submission with empty fields

**Environment:**
- Browser: Chrome
- OS: Windows 10

**Steps to Reproduce:**
1. Add item to cart
2. Go to checkout page
3. Leave all fields empty
4. Click continue

**Expected Result:**
Validation error messages should be displayed.

**Actual Result:**
System allows user to proceed without validation.

**Severity:** Critical  
**Priority:** High  

---

## BUG004 - Product sorting not applied correctly

**Environment:**
- Browser: Chrome

**Steps to Reproduce:**
1. Login
2. Select "Price: Low to High"

**Expected Result:**
Products should be sorted from lowest to highest price.

**Actual Result:**
Product order remains unchanged.

**Severity:** Minor  
**Priority:** Medium  

---

## BUG005 - Session does not expire after inactivity

**Environment:**
- Browser: Chrome

**Steps to Reproduce:**
1. Login to application
2. Stay idle for 30+ minutes
3. Try to interact with system

**Expected Result:**
User session should expire and require re-login.

**Actual Result:**
User session remains active.

**Severity:** Medium  
**Priority:** Low  

## Notes

- Bugs are documented based on simulated scenarios for demonstration purposes.
- Real application behavior may vary.
