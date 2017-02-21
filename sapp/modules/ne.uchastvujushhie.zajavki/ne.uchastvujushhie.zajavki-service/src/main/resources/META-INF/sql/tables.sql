create table ne_uchastvujushhie_zajavki_ne_uchastvujushhie_zajavki (
	data_sozdanija DATE null,
	itogo_za_tovar DOUBLE,
	izvewenie_id LONG,
	kolichestvo LONG,
	lot_id LONG,
	ne_uchastvujushhie_zajavki_id LONG not null primary key,
	postavwik_id LONG,
	sozdal LONG,
	summa_za_edinicu_tovara DOUBLE,
	tovar_id LONG
);