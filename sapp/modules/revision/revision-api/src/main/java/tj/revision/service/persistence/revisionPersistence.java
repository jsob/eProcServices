/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package tj.revision.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.revision.exception.NoSuchrevisionException;

import tj.revision.model.revision;

/**
 * The persistence interface for the revision service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.revision.service.persistence.impl.revisionPersistenceImpl
 * @see revisionUtil
 * @generated
 */
@ProviderType
public interface revisionPersistence extends BasePersistence<revision> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link revisionUtil} to access the revision persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the revision in the entity cache if it is enabled.
	*
	* @param revision the revision
	*/
	public void cacheResult(revision revision);

	/**
	* Caches the revisions in the entity cache if it is enabled.
	*
	* @param revisions the revisions
	*/
	public void cacheResult(java.util.List<revision> revisions);

	/**
	* Creates a new revision with the primary key. Does not add the revision to the database.
	*
	* @param revision_id the primary key for the new revision
	* @return the new revision
	*/
	public revision create(long revision_id);

	/**
	* Removes the revision with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param revision_id the primary key of the revision
	* @return the revision that was removed
	* @throws NoSuchrevisionException if a revision with the primary key could not be found
	*/
	public revision remove(long revision_id) throws NoSuchrevisionException;

	public revision updateImpl(revision revision);

	/**
	* Returns the revision with the primary key or throws a {@link NoSuchrevisionException} if it could not be found.
	*
	* @param revision_id the primary key of the revision
	* @return the revision
	* @throws NoSuchrevisionException if a revision with the primary key could not be found
	*/
	public revision findByPrimaryKey(long revision_id)
		throws NoSuchrevisionException;

	/**
	* Returns the revision with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param revision_id the primary key of the revision
	* @return the revision, or <code>null</code> if a revision with the primary key could not be found
	*/
	public revision fetchByPrimaryKey(long revision_id);

	@Override
	public java.util.Map<java.io.Serializable, revision> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the revisions.
	*
	* @return the revisions
	*/
	public java.util.List<revision> findAll();

	/**
	* Returns a range of all the revisions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link revisionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of revisions
	* @param end the upper bound of the range of revisions (not inclusive)
	* @return the range of revisions
	*/
	public java.util.List<revision> findAll(int start, int end);

	/**
	* Returns an ordered range of all the revisions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link revisionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of revisions
	* @param end the upper bound of the range of revisions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of revisions
	*/
	public java.util.List<revision> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<revision> orderByComparator);

	/**
	* Returns an ordered range of all the revisions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link revisionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of revisions
	* @param end the upper bound of the range of revisions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of revisions
	*/
	public java.util.List<revision> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<revision> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the revisions from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of revisions.
	*
	* @return the number of revisions
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}