create table sapp.godovoj_plan_zakupok (
	data_sozdanija DATE null,
	godovoj_plan_zakupok_id LONG not null primary key,
	istochnik_finansirovanija_id LONG,
	naimenovanie_predmeta_zakupki VARCHAR(75) null,
	planiruemyj_metod_zakupki_id LONG,
	predpolagaemaja_summa DOUBLE,
	sozdal LONG,
	sroki_provedenija_zakupki VARCHAR(75) null,
	summa_finansirovanija DOUBLE,
	vbk_id LONG
);