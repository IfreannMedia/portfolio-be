insert into projects(name, project_type, description, access_url, github_urls, image_url)
values (
	'Portfolio site',
	'website',
	'A developr should have a website right? That''s why I threw this one pager together. I built the frontend using Angular, Typescript, and scss . I built the backend using Quarkus, Java, and Postgresql.',
	'',
	'{"https://github.com/IfreannMedia/portfolio-website", "https://github.com/IfreannMedia/portfolio-be"}',
	''
);

insert into projects(name, project_type, description, access_url, github_urls, image_url)
values (
	'Chuck Norris Joke Machine',
	'website',
	'This website makes use of the web browser''s speech recognition and speech synthesis APIs, you''ll probably need the latest version of Chrome to use it. Working with Angular and React motivated me to go back to basics and develop a website using plain old HTML Javascript and CSS. Though I did use tachyons to speed up the styling.',
	'https://chuck-can-hear-you.herokuapp.com/',
	'{"https://github.com/IfreannMedia/Chuck-Norris"}',
	''
);

insert into projects(name, project_type, description, access_url, github_urls, image_url)
values (
	'Smart Brain Image Scan',
	'website',
	'I decided to give React a test drive and used it to create this web app. The backend was built using express, and the app allows users to create accounts, and utilize a face recognition API on pictures to detect faces.',
	'https://face-recog-fe.herokuapp.com/',
	'{"https://github.com/IfreannMedia/facial-recognition-app", "https://github.com/IfreannMedia/face-recog-api"}',
	'../../../assets/images/face_recog.png'
);

insert into projects(name, project_type, description, access_url, github_urls, image_url)
values (
	'Invasion',
	'game',
	'Invasion is a 3D shoot em up game I designed and developed using the Unity engine, C# and Blender. It was the final deliverable for my MSc. I programmed the player character, all mechanics and UIs, the scoring system, level management, and the enemy AI. I also created the 3D models in blender, and animated the player character. Not just coding, but plenty of UX went into the iterative prototyping and development of this artefact.',
	'https://ifreannmedia.itch.io/invasion',
	'{"https://github.com/IfreannMedia/Invasion"}',
	'../../../assets/images/invasion_cover.png'
);

insert into projects(name, project_type, description, access_url, github_urls, image_url)
values (
	'Cyber Ryder',
	'game',
	'Cyber Ryder is a 3D cyber themed racing game I developed as a mini-project during my masters using Unity and C#.',
	'https://ifreannmedia.itch.io/cyber-ryder',
	'{}',
	'../../../assets/images/cyber_ryder_cover.png'
);

insert into projects(name, project_type, description, access_url, github_urls, image_url)
values (
	'Demonic 5',
	'game',
	'Demonic 5 was a 2D narrative/turn based combat game I developed using the unity game engine, the fungus dialogue system and C#.',
	'https://ifreannmedia.itch.io/demonic-five',
	'{}',
	'../../../assets/images/demonic_five_cover.png'
);

select * from experiences_technologies;

select * from experiences;
select * from projects;
select * from technologies;
select * from experiences_technologies;