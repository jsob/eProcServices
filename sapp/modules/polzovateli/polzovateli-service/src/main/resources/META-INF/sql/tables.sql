create table sapp.polzovateli (
	aktivnost LONG,
	data_izmenenija DATE null,
	data_sozdanija DATE null,
	imja_polzovatelja VARCHAR(75) null,
	izmenil LONG,
	organizacija_id LONG,
	parol VARCHAR(75) null,
	podrazdelenije_id LONG,
	polzovateli_id LONG not null primary key,
	rol_id LONG,
	sozdal LONG,
	tip_organizacii_id LONG
);