<b>Planet: <i>${planet.planetName}</i></b>
<br/>
<table cellspacing="0" class="basic-table hover-bar">
<thead>
<tr class="header-row-2">
<td>ContactMechId</td>
<td>Address</td>
<td>City</td>
<td>Postal Code</td>
</tr>
</thead>
<tbody>
<#list planetAddresses as address>
<tr>
  <td>${address.contactMechId}</td>
  <td>${address.address1!""} ${address.address2!""}</td>
  <td>${address.city!""}</td>
  <td>${address.postalCode!""}</td>
</tr>
</#list>
</tbody>
</table>
