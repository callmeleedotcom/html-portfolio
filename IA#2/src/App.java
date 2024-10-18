/* General styles */
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f4f4f4;
}

/* Login Page Styles */
.login-container {
    width: 300px;
    margin: 100px auto;
    padding: 20px;
    background-color: #fff;
    box-shadow: 0px 0px 10px rgba(0,0,0,0.1);
}

.login-container h2 {
    text-align: center;
}

.login-container label,
.login-container input {
    display: block;
    width: 100%;
    margin-bottom: 10px;
}

/* Product Page Styles */
.product-container {
    display: grid;
    grid-template-columns: repeat(3, 1fr);
    gap: 20px;
    padding: 20px;
}

.product {
    padding: 15px;
    background-color: white;
    border: 1px solid #ddd;
    text-align: center;
}

.product img {
    width: 100%;
    height: auto;
}

/* Invoice Page Styles */
#invoice-details {
    margin: 20px;
    padding: 10px;
    background-color: #fff;
    box-shadow: 0px 0px 10px rgba(0,0,0,0.1);
}

/* About Us Page Styles */
h2, p {
    text-align: center;
}
// Login page logic
const username = "user123";
const password = "password123";
let attempts = 0;

document.getElementById('loginForm').addEventListener('submit', function(e) {
    e.preventDefault();
    const enteredUsername = document.getElementById('username').value;
    const enteredPassword = document.getElementById('password').value;

    if (enteredUsername === username && enteredPassword === password) {
        window.location.href = "product.html";  // Redirect to product page on successful login
    } else {
        attempts++;
        document.getElementById('errorMessage').textContent = "Invalid login. Attempt " + attempts;
        if (attempts >= 3) {
            window.location.href = "error.html";  // Redirect to error page after 3 attempts
        }
    }
});

// Product page logic
let cart = [];

function addToCart(productId) {
    cart.push(productId);
    alert("Product added to cart");
}

function checkout() {
    window.location.href = "invoice.html";
}

function cancel() {
    cart = [];
    alert("Cart cleared");
}

// Invoice page logic
// You can use stored data from global array `cart` to generate the invoice
