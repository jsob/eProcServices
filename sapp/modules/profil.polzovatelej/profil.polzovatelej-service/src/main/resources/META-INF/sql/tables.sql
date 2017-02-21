create table sapp.profil_polzovatelej (
	data_izmenenija DATE null,
	data_sozdanija DATE null,
	inicialy VARCHAR(75) null,
	izmenil LONG,
	je_pochta VARCHAR(75) null,
	kontaktnyj_telefon VARCHAR(75) null,
	polzovatel_id LONG,
	profil_polzovatelej_id LONG not null primary key,
	sozdal LONG
);