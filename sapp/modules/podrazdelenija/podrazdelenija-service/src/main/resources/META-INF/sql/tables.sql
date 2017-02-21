create table sapp.podrazdelenija (
	data_izmenenija DATE null,
	data_sozdanija DATE null,
	izmenil LONG,
	organizacija_id LONG,
	podrazdelenie VARCHAR(75) null,
	podrazdelenija_id LONG not null primary key,
	sozdal LONG
);