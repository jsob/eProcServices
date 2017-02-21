create table sapp.naruwenija_v_izvewenii (
	data_sozdanija DATE null,
	izvewenie_id LONG,
	naruwenie VARCHAR(75) null,
	naruwenija_v_izvewenii_id LONG not null primary key,
	nomer_razdela LONG,
	sozdal LONG
);