<p class="lead">Shop Name</p>
<div class="list-group">

	<c:forEach items="${cat}" var="cate">

		<a href="${contextRoot}//show/cate/${cate.id}/products" class="list-group-item">${cate.name}</a>

	</c:forEach>
</div>