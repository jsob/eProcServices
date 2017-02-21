create table sapp.zajavki_ot_postavwikov (
	data_izmenenija DATE null,
	data_sozdanija DATE null,
	itogo_za_tovar DOUBLE,
	izmenil LONG,
	izvewenie_id LONG,
	kod_po_obshhemu_klassifikatoru LONG,
	kod_strany_proizvoditelja LONG,
	kolichestvo LONG,
	lot_id LONG,
	opisanie_tovara VARCHAR(75) null,
	postavwik_id LONG,
	predlozhenie_postavwika VARCHAR(75) null,
	sozdal LONG,
	summa_za_edinicu_tovara DOUBLE,
	tovar_id LONG,
	zajavki_ot_postavwikov_id LONG not null primary key
);