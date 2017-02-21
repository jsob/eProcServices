create table sapp.istorija_popolnenij (
	data_zachislenija DATE null,
	istorija_popolnenij_id LONG not null primary key,
	nomer VARCHAR(75) null,
	postavwik_id LONG,
	put VARCHAR(75) null,
	summa DOUBLE,
	tip VARCHAR(75) null,
	tranzakcija VARCHAR(75) null,
	zachislil LONG
);