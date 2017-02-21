create table sapp.spisok_tovarov_vremenno (
	data_sozdanija DATE null,
	edinica_izmerenija_id LONG,
	izvewenie_id LONG,
	klassifikacija_po_okdp VARCHAR(75) null,
	kod_po_okdp VARCHAR(75) null,
	kod_po_spravochniku_naimenovanij LONG,
	kod_strany_proizvoditelja LONG,
	kolichestvo LONG,
	naimenovanie_tovara VARCHAR(75) null,
	nomer_lota LONG,
	opisanie_tovara VARCHAR(75) null,
	sozdal LONG,
	spisok_tovarov_vremenno_id LONG not null primary key
);