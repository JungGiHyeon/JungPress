<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"			%>
<header class="navbar navbar-expand navbar-dark flex-column flex-md-row bd-navbar">
	<a class="navbar-brand mr-0 mr-md-2" href="/" aria-label="Bootstrap">Bootstrap</a>
	
	<div class="navbar-nav-scroll">
		<ul class="navbar-nav bd-navbar-nav flex-row">
			<li class="nav-item">
				<a class="nav-link active" href="/">Home</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="">Documentation</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="">Examples</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="">Themes</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="">Jobs</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="">Expo</a>
			</li>
			<li class="nav-item">
				<a class="nav-link" href="">Blog</a>
			</li>
		</ul>
	</div>
</header>

<div class="container-fluid">
	<div class="row flex-xl-nowrap">
		<div class="col-12 col-md-3 col-xl-2 bd-sidebar">

			<form class="bd-search d-flex align-items-center">
				<input type="search" class="form-control" id="search-input"
					placeholder="Search..." aria-label="Search for..."
					autocomplete="off">
				<button
					class="btn btn-link bd-search-docs-toggle d-md-none p-0 ml-3"
					type="button" data-toggle="collapse" data-target="#bd-docs-nav"
					aria-controls="bd-docs-nav" aria-expanded="false"
					aria-label="Toggle docs navigation">
					<svg xmlns="http://www.w3.org/2000/svg" viewbox="0 0 30 30"
						width="30" height="30" focusable="false">
						<title>Menu</title><path stroke="currentColor" stroke-width="2"
							stroke-linecap="round" stroke-miterlimit="10"
							d="M4 7h22M4 15h22M4 23h22" /></svg>
				</button>
			</form>
			
			<nav class="collapse bd-links" id="bd-docs-nav">
				<div class="bd-toc-item active">
					<a class="bd-toc-link" href="">Getting started</a>

					<ul class="nav bd-sidenav">
						<li class="active bd-sidenav-active"><a href="">Introduction</a></li>
						<li><a href="">Download</a></li>
						<li><a href="">Contents</a></li>
						<li><a href="">Browsers & devices</a></li>
						<li><a href="">JavaScript</a></li>
						<li><a href="">Theming</a></li>
						<li><a href="">Build tools</a></li>
						<li><a href="">Webpack</a></li>
						<li><a href="">Accessibility</a></li>
					</ul>
				</div>
				<div class="bd-toc-item">
					<a class="bd-toc-link" href="">Layout </a>
					
					<ul class="nav bd-sidenav">
						<li><a href="">Overview</a></li>
						<li><a href="">Grid</a></li>
						<li><a href="">Media object</a></li>
						<li><a href="">Utilities for layout</a></li>
					</ul>
				</div>
				<div class="bd-toc-item">
					<a class="bd-toc-link" href="">Content</a>
					
					<ul class="nav bd-sidenav">
						<li><a href="">Reboot</a></li>
						<li><a href="">Typography</a></li>
						<li><a href="">Code</a></li>
						<li><a href="">Images</a></li>
						<li><a href="">Tables</a></li>
						<li><a href="">Figures</a></li>
					</ul>
				</div>
			</nav>
		</div>