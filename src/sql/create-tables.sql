CREATE TABLE projects ( 
	name VARCHAR,
	description VARCHAR,
	technologiesUsed integer,
	projectType integer,
	imageUrl VARCHAR,
	githubUrl VARCHAR,
	accessUrl VARCHAR
	};

CREATE TABLE technologiesMap ( 
	name VARCHAR,
	projectId integer,
	experienceId integer,
	technologyId integer
);

CREATE TABLE technologies ( 
	name VARCHAR 
);

CREATE TABLE experience (
	title VARCHAR,
	description VARCHAR,
	skills integer, --many to one mapping, so points to
	dateFrom date,
	dateTo date,
	current boolean,
	location VARCHAR );