<!doctype html>

<html>
  <head>
  	<title>List Products</title>
  </head>

  <body>
    ${allProducts.name} ${allProducts.price} ${allProducts.sku}
    <table border="1">
    	<g:each in="${allProducts}" var="thisProduct">
    		<tr>
    			<td>${thisProduct.name}</td>
          <td>${thisProduct.price}</td>
          <td>${thisProduct.sku}</td>
    		</tr>
    	</g:each>
    </table>
  </body>
</html>
