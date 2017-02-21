create table pretenzii_ot_postavshhikov_pretenzii_ot_postavshhikov (
	data_zagruzki DATE null,
	imja_fajla VARCHAR(75) null,
	izvewenie_id LONG,
	lot_id LONG,
	nazvanie_dokumenta VARCHAR(75) null,
	postavshik_id LONG,
	pretenzii_ot_postavshhikov_id LONG not null primary key,
	zagruzil LONG
);