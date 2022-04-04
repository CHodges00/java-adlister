<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Pizza</title>
</head>
<body>
<div class="container">
  <h2>Pizza Order Place</h2>
  <form method="post">
    <div class="form-group">
      <label for="size">Size</label>
      <select id="size" name="size">
        <option value="small">Small</option>
        <option value="medium">Medium</option>
        <option value="large">Large</option>
      </select>
    </div>
    <div class="form-group">
      <label for="sauces">Sauces</label>
      <select id="sauces" name="sauces">
        <option value="marinara">Marinara</option>
        <option value="alfredo">Alfredo</option>
        <option value="none">No Sauce</option>
      </select>
    </div>
    <div class="form-group">
      <label for="crusts">Crusts</label>
      <select id="crusts" name="crusts">
        <option value="thin">Thin</option>
        <option value="stuffed">Stuffed</option>
        <option value="personal">Personal</option>
      </select>
    </div>
    <div class="form-group">
      <input type="checkbox" id="pepperoni" name="toppings" value="pepperoni">
      <label for="pepperoni">Pepperoni</label><br>
      <input type="checkbox" id="bacon" name="toppings" value="sardines">
      <label for="bacon">Bacon</label><br>
      <input type="checkbox" id="mushroom" name="toppings" value="sardines">
      <label for="mushroom">Mushrooms</label><br>
      <input type="checkbox" id="olives" name="toppings" value="sardines">
      <label for="olives">Olives</label><br>
    </div>
    <div class="form-group">
      <label for="address">Address -- </label>
      <input type="text" id="address" name="address">
    </div>
    <input type="submit" class="btn btn-primary" value="Submit">
  </form>
</div>
</body>
</html>
